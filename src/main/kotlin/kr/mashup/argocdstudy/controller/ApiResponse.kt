package kr.mashup.argocdstudy.controller

data class ApiResponse<T>(
    val code: String = "",
    val message: String = "",
    val data: T?
) {

    companion object {
        val OK = ApiResponse(data = "OK")
    }

}
