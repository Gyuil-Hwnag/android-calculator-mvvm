#### Step4(2023-08-09) https://github.com/next-step/android-calculator-mvvm/pull/152
    * 리팩토링
        * [x] calculator 모듈은 data 모듈의 구현체에 의존하지 않아야 한다.
        * [x] data 모듈의 구현체는 모두 internal class여야 한다.
    * 1차 피드백
        * [x] History id값 추가(DiffUtils 비교 & 같은 수식, 같은 값 오는 경우)
        * [x] 계산 로직 domain 모듈로 이전(ViewModel에서 계산후 히스토리 적용 관련 로직 UseCase로 이전)
        * [x] executorService 제거 & withContext로 수정
        * [x] ViewModel에서 Calculator 객체 가지고 있던 내용 제거

#### Step3(2023-08-07) https://github.com/next-step/android-calculator-mvvm/pull/149
    * 계산 기록
        * [x] = 버튼을 누를 때마다 계산 기록에 저장되어야 한다.
        * [x] 시계 버튼을 누르면 계산 기록을 볼 수 있는 UI가 보여야 한다.
        * [x] 앱을 종료하고 켜도 이전 계산 기록들은 남아있어야 한다.
        * [x] 계산 기록 UI가 떠 있는 상태에서 시계 버튼을 다시 누르면 계산 기록 UI가 사라져야 한다.
        * [x] ViewModel의 모든 로직에 대한 단위 테스트를 작성해야 한다.
        * [x] Data 모듈의 계산기록을 저장하고 불러오는 코드에 대해 단위 테스트를 작성
        * [x] 계산 기록에 대한 Ui 테스트를 작성한다.
    * 1차 피드백
        * [x] List 삼항 연산자 -> 확장함수 사용
        * [x] UseCase 클래스명 통일 (유저 관점으로 Calculate로)
        * [x] DiffCallback 동일성 비교 수정 (유일한 값으로)
        * [x] ViewModel에서 Dispatcher.IO로 설정하던 부분 Data 모듈이 담당하도록 이전

#### Step2(2023-08-05) https://github.com/next-step/android-calculator-mvvm/pull/147
    * Calculator MVVM 구현
        * [x] 사용자가 클릭한 값에 따라서 사칙 연산을 수행하는 계산기 구현 및 테스트 코드 추가
        * [x] 사용자가 입력한 숫자를 화면에 보여줘야 한다.
        * [x] 숫자를 연속해서 입력한 경우에는 연속된 숫자를 보여줘야 한다. 
        * [x] 숫자를 입력하지 않은 경우, 연산자 +, -, ×, ÷ 버튼을 누르면 화면에 아무런 변화가 없어야 한다.
        * [x] 숫자를 입력한 경우, 연산자 +, -, ×, ÷ 버튼을 누르면 해당 기호가 화면에 보여야 한다.
        * [x] 입력된 수식이 없을 때, 사용자가 지우기 버튼을 누르면 화면에 아무런 변화가 없어야 한다.
        * [x] 입력된 수식이 있을 때, 지우기 버튼을 누르면 마지막으로 입력된 값이 지워져야 한다.
        * [x] 입력된 수식이 완전할 때, = 을 누르면 계산한 결과가 나와야 한다.
        * [x] 입력된 수식이 완전하지 않을 때, = 을 누르면 토스트 메세지가 나와야 한다.
        * [x] CalculatorActivity 테스트 코드 추가
        * [x] CalculatorViewModel 테스트 코드 추가
    * 1차 피드백
        * [x] onNumberButtonClicked(number: Int) 함수 -> onButtonClicked(viewId: Int)
        * [] MutableLiveData<String> -> MutableLiveData<Expression>
        * [] 테스트 코드 viewModel.removeLast() 메서드 앞에 viewModel.addToExpression()에 의존성을 가지던 내용
        
#### Step1(2023-08-03) https://github.com/next-step/android-calculator-mvvm/pull/146
    * Counter MVVM 구현
        * [x] UP 버튼을 클릭하면 숫자가 1 증가해야 한다.
        * [x] DOWN 버튼을 클릭하면 숫자가 1 감소해야 한다.
        * [x] 숫자는 음수가 될 수 없다.
        * [x] 0일 때, DOWN 버튼을 클릭하면 0 이하로 내릴 수 없습니다 토스트 메시지가 보여야 한다.
        * [x] 모든 코드가 MVVM패턴으로 구현되어야 한다.
        * [x] Counter에 대한 테스트 코드 작성
    * 1차 피드백
        * [x] CounterViewModel 내부 변수 & 함수명 수정(해당 기능에 대해서 한눈에 보이도록)
        * [x] ViewModel 테스트 코드 추가
    * 2차 피드백
        * [x] CountViewModel 내부 1 상수화
        * [x] 초기값 0인지 테스트 코드 추가, 0 이하일 경우 테스트 코드 추가
        * [x] 자주 사용하는 Ui 테스트 코드 함수화
