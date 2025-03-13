package exercise3

sealed class Result {
    data object Loading : Result()
    data object Error : Result()
    data class Sucess(val data: String) : Result()
}
