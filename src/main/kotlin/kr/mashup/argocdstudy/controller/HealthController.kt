package kr.mashup.argocdstudy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/ping")
    fun healthCheck(): ApiResponse<String> {
        return ApiResponse.OK
    }

}
