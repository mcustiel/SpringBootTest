package org.mcustiel.testbootstrap.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.inject.Inject;
import javax.xml.ws.http.HTTPException;

import org.mcustiel.testbootstrap.domain.Dashboard;
import org.mcustiel.testbootstrap.domain.ids.DashboardId;
import org.mcustiel.testbootstrap.input.DashboardResource;
import org.mcustiel.testbootstrap.services.DashboardService;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dashboard", consumes = { "application/hal+json",
	"application/vnd.booky-v1+json" }, produces = { "application/hal+json" })
public class DashboardController {
    @Inject
    private DashboardService dashboardService;
    @Inject
    private ConversionService conversionService;

    public DashboardController(DashboardService dashboardService,
	    ConversionService conversionService) {
	this.dashboardService = dashboardService;
	this.conversionService = conversionService;
    }

    @RequestMapping(value = "/{dashboardId}", method = GET)
    public ResponseEntity<DashboardResource> getDashboardById(
	    @PathVariable Integer dashboardId) {
	try {
	    return new ResponseEntity<DashboardResource>(
		    conversionService.convert(dashboardService
			    .getById(new DashboardId(dashboardId)),
			    DashboardResource.class), HttpStatus.OK);
	} catch (Exception e) {
	    throw new HTTPException(HttpStatus.INTERNAL_SERVER_ERROR.value());
	}
    }

    @RequestMapping(method = POST)
    public ResponseEntity<DashboardResource> createDashboard(
	    DashboardResource dashboardResource) {
	Dashboard dashboard = dashboardService
		.createDashboard(conversionService.convert(dashboardResource,
			Dashboard.class));
	dashboardResource.setId(dashboard.getId().getValue());
	return new ResponseEntity<DashboardResource>(dashboardResource,
		HttpStatus.CREATED);
    }
}
