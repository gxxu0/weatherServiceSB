package com.weather;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
//    @RequestMapping(value="api", method = RequestMethod.GET)//메소드가 어떻게 해야지 이 함수를 호출할 수 있는지 어노테이션 선언
//    @ResponseStatus(value = HttpStatus.OK)//반응은 이렇게 줄거야 (정상적으로 결과를 줌)
//    public String getApiTest(){
//        return "login";
//    }
@RequestMapping(value="/", method = RequestMethod.GET)
public String home() {
    return "hello";
}
//    @RequestMapping(value="api/weather2", method = RequestMethod.POST)//메소드가 어떻게 해야지 이 함수를 호출할 수 있는지 어노테이션 선언
//    @ResponseStatus(value = HttpStatus.OK)//반응은 이렇게 줄거야 (정상적으로 결과를 줌)
//    public String getApiTest2(){
//        return "{\"result\":\"jinny2\"}";
//    }

    //localhost:8080/api/weather
}
