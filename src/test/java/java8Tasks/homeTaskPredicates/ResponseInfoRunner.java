package java8Tasks.homeTaskPredicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ResponseInfoRunner {

    /*6. Define a predicate to check if the status code is 400.
    Print all the responses with status code 400 from the given list of responses.*/
    public void getResponseWithStatusCode400(List<ResponseInformation> resInformation, int statusCode) {
        System.out.println("\n" + "TASK 1 Status Code 400");
        Predicate<ResponseInformation> respInfoPredicate = respCode -> (respCode.getStatusCode() == statusCode);
        List filteredStatusCode = resInformation.stream().filter(status -> respInfoPredicate.test(status)).map(s -> s.getStatusCode()).collect(Collectors.toList());
        filteredStatusCode.forEach(System.out::println);
    }

    /*7. Define a predicate to check if the response type JSON.
    Print all the responses the response type JSON from the given list of responses.*/
    public void getResponseWithStatusTypeJson(List<ResponseInformation> responseInformationList, String responseType) {
        System.out.println("\n" + "TASK 2 Status Type JSON");
        Predicate<ResponseInformation> respInfoPredicate = respContentType -> (respContentType.getResponseType().equalsIgnoreCase(responseType));
        for (ResponseInformation getRespStatus : responseInformationList) {
            if (respInfoPredicate.test(getRespStatus)) {
                System.out.println("STATUS TYPE->" + getRespStatus.getResponseType());
            }
        }
    }

    /*8. Print all the responses with status code 400 and response type JSON*/
    public void geResponseWithStatusTypeJsonAndCode400(List<ResponseInformation> responseInformationList, String responseType, int statusCode) {
        System.out.println("\n" + "TASK 3 Status CODE TYPE 400&JSON");
        Predicate<ResponseInformation> respStatusCodePredicate = respCode -> (respCode.getStatusCode() == statusCode);
        Predicate<ResponseInformation> respContentTypePredicate = respContentType -> (respContentType.getResponseType().equalsIgnoreCase(responseType));
        for (ResponseInformation getRespStatus : responseInformationList) {
            if (respStatusCodePredicate.and(respContentTypePredicate).test(getRespStatus)) {
                System.out.println("TYPE->" + getRespStatus.getResponseType() + "CODE->" + getRespStatus.getStatusCode());
            }
        }
    }

    /*9. Print all the responses with status code 400 or response type JSON*/
    public void geResponseWithStatusTypeJsonOrCode400(List<ResponseInformation> responseInformationList, String responseType, int statusCode) {
        System.out.println("\n" + "TASK 5 Status NOT CODE TYPE 400&JSON");
        Predicate<ResponseInformation> respStatusCodePredicate = respCode -> (respCode.getStatusCode() != statusCode);
        Predicate<ResponseInformation> respContentTypePredicate = respContentType -> (!respContentType.getResponseType().equalsIgnoreCase(responseType));
        responseInformationList.stream().filter(respStatusCodePredicate.or(respContentTypePredicate)).
                map(responseInformation -> responseInformation.getStatusCode()).collect(Collectors.toList());
        responseInformationList.forEach(System.out::println);
    }

    /*10. Print all the responses with status code is not 400 and response type JSON*/
    public void geResponseWithStatusNotCode400AndTypeJson(List<ResponseInformation> responseInformationList, String responseType, int statusCode) {
        System.out.println("\n" + "TASK 5 Status NOT CODE TYPE 400&JSON");
        Predicate<ResponseInformation> respStatusCodePredicate = respCode -> (respCode.getStatusCode() != statusCode);
        Predicate<ResponseInformation> respContentTypePredicate = respContentType -> (!respContentType.getResponseType().equalsIgnoreCase(responseType));
        for (ResponseInformation getRespStatus : responseInformationList) {
            if (respStatusCodePredicate.and(respContentTypePredicate).test(getRespStatus)) {
                System.out.println("TYPE->" + getRespStatus.getResponseType() + "CODE->" + getRespStatus.getStatusCode());
            }
        }
    }

    public static void main(String args[]) {
        ResponseInfoRunner responseInfoRunner = new ResponseInfoRunner();
        List<ResponseInformation> responseInfoList = new ArrayList<>();
        responseInfoList.add(new ResponseInformation("Informational Codes-101", 101, "html"));
        responseInfoList.add(new ResponseInformation("Informational Codes-102", 400, "JSON"));
        responseInfoList.add(new ResponseInformation("Informational Codes-103", 102, "html"));
        responseInfoList.add(new ResponseInformation("200 OK", 200, "xml"));
        responseInfoList.add(new ResponseInformation("201 Created", 201, "html"));
        responseInfoList.add(new ResponseInformation("202 Accepted", 202, "txt"));
        responseInfoList.add(new ResponseInformation("URL Redirection-300", 300, "xml"));
        responseInfoList.add(new ResponseInformation("URL Redirection-304", 304, "xml"));

        responseInfoList.add(new ResponseInformation("400 Bad Request", 400, "JSON"));
        responseInfoList.add(new ResponseInformation("400 Bad Request", 400, "xml"));
        responseInfoList.add(new ResponseInformation("400 Bad Request", 400, "txt"));
        responseInfoList.add(new ResponseInformation("400 Bad Request", 400, "html"));

        responseInfoList.add(new ResponseInformation("401 Unauthorized", 401, "JSON"));
        responseInfoList.add(new ResponseInformation("403 Forbidden", 403, "xml"));
        responseInfoList.add(new ResponseInformation("404 Not Found", 404, "html"));

        responseInfoRunner.getResponseWithStatusCode400(responseInfoList, 400);
        responseInfoRunner.getResponseWithStatusTypeJson(responseInfoList, "JSON");
        responseInfoRunner.geResponseWithStatusTypeJsonAndCode400(responseInfoList, "JSON", 400);
        responseInfoRunner.geResponseWithStatusNotCode400AndTypeJson(responseInfoList, "JSON", 400);
    }
}
