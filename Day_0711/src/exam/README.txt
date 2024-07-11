<연습>
Chicken 추상 클래스
cook() 추상 메소드 // 몸통이 있으면 안 됨

FriedChicken extends Chicken // 후라이드 치킨
cook() - "튀긴다."

SeasonedChicken extends Chicken // 양념 치킨
cook() - "양념을 바른다."

ChickenTest
- main()
- process(Chicken chicken)
각각의 cook을 호출하는 코드