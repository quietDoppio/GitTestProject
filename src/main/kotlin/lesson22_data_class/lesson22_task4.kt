package lesson22_data_class

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
) {}

class MainScreenViewModel(
    var mainScreenState: MainScreenState = MainScreenState()
) {
    fun loadData() {
        if (mainScreenState.data.isNullOrEmpty()) {
            println("Данные отсутствуют")
            mainScreenState = mainScreenState.copy(isLoading = true)
            println("Загрузка данных")
            mainScreenState = mainScreenState.copy("данные", isLoading = false)
            println("Данные загружены.\n$mainScreenState")
        }
    }
}