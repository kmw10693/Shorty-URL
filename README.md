
## 레이어별 역할

| 레이어                | 책임                                   | 특징                                   |
|-----------------------|---------------------------------------------|-----------------------------------------------------|
| **domain/**          | 엔티티, Value Object, 도메인 이벤트         | 순수 비즈니스 모델                  |
| **application/**     | Use-Case, 트랜잭션 경계, Port 인터페이스    | `port/in`, `port/out`, `service` 3단 구성          |
| **adapter/in**       | 외부 요청 수신 (REST, CLI 등)               | DTO ↔ Command 변환 후 **port/in** 호출             |
| **adapter/out**      | 기술 구현체               | **port/out** 구현 → 기술 교체가 쉬움               |

> **Hexagonal 핵심:**  
> 각 Bounded Context(`shortener`, `redirect`, `analytics`)마다  
> **Domain → Application(Port) → Adapter** 패턴을 반복해  
> 비즈니스 로직을 기술 세부사항으로부터 깔끔히 분리
