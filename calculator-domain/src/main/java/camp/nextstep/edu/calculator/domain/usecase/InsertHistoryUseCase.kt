package camp.nextstep.edu.calculator.domain.usecase

import camp.nextstep.edu.calculator.domain.model.History
import camp.nextstep.edu.calculator.domain.repository.HistoryRepository

class InsertHistoryUseCase(
    private val repository: HistoryRepository
) {
    suspend operator fun invoke(history: History) {
        return repository.insertHistory(history)
    }
}