package net.spirion.jmapperissue;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.enums.ChooseConfig;
import com.xxx.schema.pega.pegasusadapterv02.getaircraftlinkedflightsresponsev01.GetAircraftLinkedFlightsResponse;

/**
 * Responsible for running multiple instances of mapping tests for either manual mapping or jmapper mapping.
 *
 * @author Michael.Conway
 */
public class ClassMappingDelegate {

    /**
     * The bean to convert.
     */
    private com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01.GetAircraftLinkedFlightsResponse getAircraftLinkedFlightsResponse;

    /**
     * The jmapper instance.
     */
    private JMapper<GetAircraftLinkedFlightsResponse, com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01.GetAircraftLinkedFlightsResponse> jmapper;

    /**
     * Constructor.
     */
    public ClassMappingDelegate() {
        final GetAircraftLinkedFlightsResponseCreationDelegate getAircraftLinkedFlightsResponseCreationDelegate = new GetAircraftLinkedFlightsResponseCreationDelegate();
        this.getAircraftLinkedFlightsResponse = getAircraftLinkedFlightsResponseCreationDelegate.create();
        configureJmapper();
    }

    /**
     * Configure jmapper.
     */
    private void configureJmapper() {
        //final String jmapperXmlLocation = "file:/C:/Users/n448072/git/jmapper-issue/src/main/resources/jmapper.xml";
        final String jmapperXmlLocation = "jmapper.xml";
        this.jmapper = new JMapper<>(
                GetAircraftLinkedFlightsResponse.class,
                com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01.GetAircraftLinkedFlightsResponse.class,
                ChooseConfig.DESTINATION,
                jmapperXmlLocation);
    }

    /**
     * Run a mapping process a number of times.
     *
     * @param iterations Number of iterations
     */
    public void runMappingTest(int iterations) {
        for (int index = 0; index < iterations; index++) {
            Object obj = jmapper.getDestination(this.getAircraftLinkedFlightsResponse);
            System.out.println(obj);
        }
    }

}
