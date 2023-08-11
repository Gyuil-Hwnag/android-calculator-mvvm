package camp.nextstep.edu.calculator.domain.usecase

import camp.nextstep.edu.calculator.domain.model.History
import camp.nextstep.edu.calculator.domain.repository.HistoryRepository

class GetCalculateHistoriesUseCase(
    private val repository: HistoryRepository
) {
    suspend operator fun invoke(): Result<List<History>> {
        val result = repository.getHistories()
        return if (result.isEmpty()) {
            Result.failure(Throwable(message = "계산 기록이 없습니다."))
        } else {
            Result.success(result)
        }
    }
}