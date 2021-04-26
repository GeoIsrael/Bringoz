package com.app.service;


import org.springframework.stereotype.Service;

@Service
public class ProcessServiceImpl implements ProcessService {


//    @Autowired
//    RecordRepository recordRepository;
//
//    @Override
//    public List<RoutePointDto> generateRoute(NewDayRouteByIdDto NewDayRouteByIdDto) {
//
//         List <RoutePoint> routePoints = new ArrayList<>();
//         LocalTime fromTime = LocalTime.parse(NewDayRouteByIdDto.getTimeAtDayFrom().toString());
//         LocalTime toTime = LocalTime.parse(NewDayRouteByIdDto.getTimeAtDayTo().toString());
//         LocalDate workDate = LocalDate.parse(NewDayRouteByIdDto.getWorkDate().toString());
//
//        Random rand = new Random();
//
//        while (fromTime.isBefore(toTime)) {
//                fromTime.getHour();
//                Market market = JsonLoader.markets.get(rand.nextInt(JsonLoader.markets.size()));
//                routePoints.add(
//                        RoutePoint.builder()
//                        .driverId(NewDayRouteByIdDto.getDriverId())
//                        .visitTime(workDate.atTime(fromTime))
//                        .latitude(market.getLat())
//                        .longitude(market.getLon())
//                        .shop(market.getShop())
//                        .name(market.getName())
//                        .build()
//                );
//
//            }
//        routePoints.stream().forEach(System.out::println);


        //получить текущее время + 60 минут
        //сравнить, если оно не больше окончания работы, сгенерировать рандомную точку
        //добавить рандомную точку в лист
        //записать лист в базу
        //вернуть лист


//        System.out.println(generateNewDriverWorkDayPeriodDto.getDriverId());  //ID
//
//
//
//        long hoursBetween = ChronoUnit.HOURS.between(fromTime, toTime);
//        long minutesBetween = ChronoUnit.MINUTES.between(fromTime, toTime);
//        System.out.println(hoursBetween + ":" + minutesBetween);


//        return null;
//    }


//    @Override
//    public RecordDto addNewRecord(DriverWorkPeriodDto newRecordDto) {
//        Record record = new Record(newRecordDto.getDriverId(), newRecordDto.getLatitude(), newRecordDto.getLongitude());
//        recordRepository.save(record);
//        return convertToRecordDto(record);
//
//    }
//
//    private RecordDto convertToRecordDto(Record record) {
//        return RecordDto.builder()
//                .id(record.getId())
//                .driverId(record.getDriverId())
//                .latitude(record.getLatitude())
//                .longitude(record.getLongitude())
//                .recordDateTime(record.getRecordDateTime())
//                .build();
//    }
}
