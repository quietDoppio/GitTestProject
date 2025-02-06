package lesson22_data_class

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}

class MainScreenViewModel() {

    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false,
    )

    private var _mainScreenState = MainScreenState()
    val mainScreenState get() = _mainScreenState

    fun loadData() {
        if (mainScreenState.data.isNullOrEmpty()) {
            println("Данные отсутствуют")
            _mainScreenState = mainScreenState.copy(isLoading = true)
            println("Загрузка данных...")
            _mainScreenState = mainScreenState.copy("данные", isLoading = false)
            println("Данные загружены.\n$mainScreenState")
        }
    }

}