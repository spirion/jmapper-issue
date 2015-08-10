package net.spirion.jmapperissue;

import com.xxx.schema.fdm.flightmanagerv02.getaircraftlinkedflightsresponsev01.*;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Utility class used to create a test pega domain GetAircraftLinkedFlightsResponse object.
 */
public class GetAircraftLinkedFlightsResponseCreationDelegate {

    /**
     * The fdm domain object factory.
     */
    private static final ObjectFactory OBJECT_FACTORY = new ObjectFactory();

    /**
     * The size of the flight object collection
     */
    private static final int DEFAULT_FLIGHT_COLLECTION_SIZE = 10;

    /**
     * Test flight origin date.
     */
    private static final LocalDate DEFAULT_FLIGHT_ORIGIN_DATE = new LocalDate(-99);

    /**
     * The size of the flight object collection
     */
    private static final int DEFAULT_FLIGHTLEG_COLLECTION_SIZE = 3;

    /**
     * A test flight number.
     */
    private static final String DEFAULT_FLIGHT_NUMBER = "DEFAULT-FLIGHT-NUMBER";

    /**
     * A test airline code.
     */
    private static final String DEFAULT_AIRLINE_CODE = "DEFAULT-AIRLINE-CODE";

    /**
     * A test airline name.
     */
    private static final String DEFAULT_AIRLINE_NAME = "DEFAULT-AIRLINE-NAME";

    /**
     * A test flight suffix.
     */
    private static final String DEFAULT_FLIGHT_SUFFIX = "DEFAULT-FLIGHT-SUFFIX";

    /**
     * A test aircraft registration value.
     */
    private static final String DEFAULT_AIRCRAFT_REGISTRATION = "DEFAULT-AIRCRAFT-REGISTRATION";

    /**
     * A test organisation name.
     */
    private static final String DEFAULT_ORGANISATION_NAME = "DEFAULT-ORGANISATION-NAME";

    /**
     * A test organisation code.
     */
    private static final String DEFAULT_ORGANISATION_CODE = "DEFAULT-ORGANISATION-CODE";

    /**
     * Default size of an aircraft type collection.
     */
    private static final int DEFAULT_AIRCRAFT_TYPE_COLLECTION_SIZE = 3;

    /**
     * A test aircraft sub type value.
     */
    private static final String DEFAULT_AIRCRAFT_SUB_TYPE = "DEFAULT-AIRCRAFT-SUB-TYPE";

    /**
     * A test aircraft type value.
     */
    private static final String DEFAULT_AIRCRAFT_TYPE = "DEFAULT-AIRCRAFT-TYPE";

    /**
     * A test aircraft type description value.
     */
    private static final String DEFAULT_AIRCRAFT_TYPE_DESCRIPTION = "DEFAULT-AIRCRAFT-TYPE-DESCRIPTION";

    /**
     * A test aircraft type source value.
     */
    private static final String DEFAULT_AIRCRAFT_TYPE_SOURCE = "DEFAULT-AIRCRAFT-TYPE-SOURCE";

    /**
     * A test error code value.
     */
    private static final String DEFAULT_ERROR_CODE = "DEFAULT-ERROR-CODE";

    /**
     * A test reason value.
     */
    private static final String DEFAULT_REASON = "DEFAULT-REASON";

    /**
     * A test timestamp value.
     */
    private static final DateTime DEFAULT_TIMESTAMP = new DateTime(6031769);

    /**
     * A test uuid value.
     */
    private static final String DEFAULT_UUID = "DEFAULT-UUID";

    /**
     * A test repeat number value.
     */
    private static final BigInteger DEFAULT_REPEAT_NUMBER = BigInteger.valueOf(441914882440l);

    /**
     * A test airport code value.
     */
    private static final String DEFAULT_AIRPORT_CODE = "DEFAULT-AIRPORT-CODE";

    /**
     * A test city code value.
     */
    private static final String DEFAULT_CITY_CODE = "DEFAULT-CITY-CODE";

    /**
     * A test airport name.
     */
    private static final String DEFAULT_AIRPORT_NAME = "DEFAULT_AIRPORT_NAME";

    /**
     * A test city name.
     */
    private static final String DEFAULT_CITY_NAME = "DEFAULT_CITY_NAME";

    /**
     * A test unit of time value.
     */
    private static final UnitOfTimeEnum DEFAULT_UNIT_OF_TIME = UnitOfTimeEnum.SECOND;

    /**
     * A test duration measure value.
     */
    private static final int DEFAULT_DURATION_MEASURE = 12;

    /**
     * A test sequence number value.
     */
    private static final BigInteger DEFAULT_SEQUENCE_NUMBER = BigInteger.valueOf(2500000);

    /**
     * Create a test bean.
     *
     * @return A test GetAircraftLinkedFlightsResponse object
     */
    public GetAircraftLinkedFlightsResponse create() {
        return aGetAircraftLinkedFlightsResponse();
    }

    /**
     * Create a test GetAircraftLinkedFlightsResponse object.
     *
     * @return A GetAircraftLinkedFlightsResponse object
     */
    private GetAircraftLinkedFlightsResponse aGetAircraftLinkedFlightsResponse() {
        GetAircraftLinkedFlightsResponse response = OBJECT_FACTORY
                .createGetAircraftLinkedFlightsResponse();
        response.getFlight().addAll(aCollectionOfFlight(DEFAULT_FLIGHT_COLLECTION_SIZE));
        response.setBusinessErrors(aBusinessErrors());
        return response;
    }

    /**
     * Create a test collection of Flight objects.
     *
     * @param size The size of the collection
     * @return A collection of Flight objects
     */
    private Collection<Flight> aCollectionOfFlight(int size) {
        Collection<Flight> flights = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            flights.add(aFlight());
        }
        return flights;
    }

    /**
     * Create a test Flight object.
     *
     * @return A Flight object
     */
    private Flight aFlight() {
        Flight flight = OBJECT_FACTORY.createFlight();
        flight.setOriginDate(DEFAULT_FLIGHT_ORIGIN_DATE);
        flight.setOperatingFlightNumber(anOperatingFlightNumber());
        flight.getFlightLeg().addAll(aCollectionOfFlightLeg(DEFAULT_FLIGHTLEG_COLLECTION_SIZE));
        return flight;
    }

    /**
     * Create a test OperatingFlightNumber object.
     *
     * @return An OperatingFlightNumber object
     */
    private OperatingFlightNumber anOperatingFlightNumber() {
        OperatingFlightNumber operatingFlightNumber = OBJECT_FACTORY.createOperatingFlightNumber();
        operatingFlightNumber.setNumber(DEFAULT_FLIGHT_NUMBER);
        operatingFlightNumber.setAirlineCode(DEFAULT_AIRLINE_CODE);
        operatingFlightNumber.setAirlineName(DEFAULT_AIRLINE_NAME);
        operatingFlightNumber.setFlightsuffix(DEFAULT_FLIGHT_SUFFIX);
        return operatingFlightNumber;
    }

    /**
     * Creat a test colelction of FlightLeg object.
     *
     * @param size The size of the collection
     * @return The flight legs
     */
    private Collection<FlightLeg> aCollectionOfFlightLeg(int size) {
        Collection<FlightLeg> flightLegs = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            flightLegs.add(aFlightLeg());
        }
        return flightLegs;
    }

    /**
     * Create a test FlightLeg object.
     *
     * @return A FlightLeg object
     */
    private FlightLeg aFlightLeg() {
        FlightLeg flightLeg = OBJECT_FACTORY.createFlightLeg();
        flightLeg.setAircraftForFlightLeg(anAircraftForFlightLeg());
        flightLeg.setCurrentDestination(aMovement());
        flightLeg.setCurrentOrigin(aMovement());
        flightLeg.setLegDuration(aDuration());
        flightLeg.setLegTimings(aFlightTimings());
        flightLeg.setRepeatNumber(DEFAULT_REPEAT_NUMBER);
        flightLeg.setUpdateDateTime(DEFAULT_TIMESTAMP);
        return flightLeg;
    }

    /**
     * Create a test Movement value.
     *
     * @return A test Movement value
     */
    private Movement aMovement() {
        Movement movement = OBJECT_FACTORY.createMovement();

        Airport airport = OBJECT_FACTORY.createAirport();
        airport.setAirportCode(DEFAULT_AIRPORT_CODE);
        airport.setAirportName(DEFAULT_AIRPORT_NAME);
        movement.setAirport(airport);

        City city = OBJECT_FACTORY.createCity();
        city.setCityCode(DEFAULT_CITY_CODE);
        city.setCityName(DEFAULT_CITY_NAME);
        movement.setCity(city);

        movement.setLocalDateTime(DEFAULT_TIMESTAMP);
        movement.setSequenceNumber(DEFAULT_SEQUENCE_NUMBER);
        return movement;
    }

    /**
     * Create a test Duration value.
     *
     * @return A Duration value
     */
    private Duration aDuration() {
        Duration duration = OBJECT_FACTORY.createDuration();
        duration.setUnitOfTime(DEFAULT_UNIT_OF_TIME);
        duration.setMeasure(DEFAULT_DURATION_MEASURE);
        return duration;
    }

    /**
     * Create a test FlightTimings value.
     *
     * @return A FlightTimings value
     */
    private FlightTimings aFlightTimings() {
        FlightTimings flightTimings = OBJECT_FACTORY.createFlightTimings();

        EventDate eventDate = OBJECT_FACTORY.createEventDate();
        eventDate.setUtc(DEFAULT_TIMESTAMP);
        eventDate.setLocal(DEFAULT_TIMESTAMP);

        flightTimings.setActualArrivalDateTime(eventDate);
        flightTimings.setActualDepartureDateTime(eventDate);
        flightTimings.setEstimatedArrivalDateTime(eventDate);
        flightTimings.setEstimatedDepartureDateTime(eventDate);
        flightTimings.setScheduledArrivalDateTime(eventDate);
        flightTimings.setScheduledDepartureDateTime(eventDate);

        return flightTimings;
    }

    /**
     * Create a test AircraftForFlightLeg object.
     *
     * @return An AircraftForFlightLeg object
     */
    private AircraftForFlightLeg anAircraftForFlightLeg() {
        AircraftForFlightLeg aircraftForFlightLeg = OBJECT_FACTORY.createAircraftForFlightLeg();

        Aircraft aircraft = OBJECT_FACTORY.createAircraft();
        aircraft.setAircraftRegistration(DEFAULT_AIRCRAFT_REGISTRATION);
        Organisation organisation = OBJECT_FACTORY.createOrganisation();
        organisation.setName(DEFAULT_ORGANISATION_NAME);
        organisation.setCode(DEFAULT_ORGANISATION_CODE);
        aircraft.setOperator(organisation);
        aircraft.getAircraftType().addAll(anAircraftTypeCollection(DEFAULT_AIRCRAFT_TYPE_COLLECTION_SIZE));
        aircraftForFlightLeg.setAircraft(aircraft);

        return aircraftForFlightLeg;
    }

    /**
     * Create a test AircraftType collection.
     *
     * @param size Size of the collection
     * @return An AircraftType collection
     */
    private Collection<AircraftType> anAircraftTypeCollection(int size) {
        Collection<AircraftType> aircraftTypes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            AircraftType aircraftType = OBJECT_FACTORY.createAircraftType();
            aircraftType.setAircraftSubType(DEFAULT_AIRCRAFT_SUB_TYPE);
            aircraftType.setAircraftType(DEFAULT_AIRCRAFT_TYPE);
            aircraftType.setAircraftTypeDescription(DEFAULT_AIRCRAFT_TYPE_DESCRIPTION);
            aircraftType.setAircraftTypeSource(DEFAULT_AIRCRAFT_TYPE_SOURCE);
            aircraftTypes.add(aircraftType);
        }
        return aircraftTypes;
    }

    /**
     * Create a test BusinessErrors object.
     *
     * @return A BusinessErrors object
     */
    private BusinessErrors aBusinessErrors() {
        BusinessErrors businessErrors = OBJECT_FACTORY.createBusinessErrors();
        businessErrors.getBusinessError().addAll(aBusinessErrorsCollection());
        return businessErrors;
    }

    /**
     * Create a collection of BusinessError objects.
     *
     * @return A collection og BusinessError objects
     */
    private Collection<BusinessError> aBusinessErrorsCollection() {
        Collection<BusinessError> businessErrors = new ArrayList<>();
        BusinessError businessError = OBJECT_FACTORY.createBusinessError();
        businessError.setCode(DEFAULT_ERROR_CODE);
        businessError.setReason(DEFAULT_REASON);
        businessError.setTimeStamp(DEFAULT_TIMESTAMP);
        businessError.setUUID(DEFAULT_UUID);
        businessError.getSubError().addAll(aSubErrorCollection());
        businessErrors.add(businessError);
        return businessErrors;
    }

    /**
     * Create a collection od SubError objects.
     *
     * @return A collection od SubError objects
     */
    private Collection<SubError> aSubErrorCollection() {
        Collection<SubError> subErrors = new ArrayList<>();
        SubError subError = OBJECT_FACTORY.createSubError();
        subError.setCode(DEFAULT_ERROR_CODE);
        subError.setReason(DEFAULT_REASON);
        subErrors.add(subError);
        return subErrors;
    }

}
