# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전

### 상품

| 한글명   | 영문명              | 설명                                       |
|-------|------------------|------------------------------------------|
| 상품    | Product          | 키친포스에 판매되고 있거나 판매될 음식과 관련된 여러가지 정보를 말한다. |
| 상품 등록 | Register Product | 상품을 키친포스에 등록하여 해당 상품을 메뉴에 추가할 수 있다.      |
| 상품 수량 | Product Quantity | 상품의 수량을 의미한다.                            |
| 상품 가격 | Product Price    | 상품의 가격을 의미한다.                            |
| 상품 이름 | Product Name     | 상품의 이름을 의미한다.                            |
| 상품 목록 | Products         | 복수개의 상품을 의미한다.                           |
| 비속어   | Profanity        | 욕설 또는 비속어를 말한다.                          |

### 메뉴 그룹

| 한글명      | 영문명                | 설명                                 |
|----------|--------------------|------------------------------------|
| 메뉴 그룹    | MenuGroup          | 특정 메뉴들이 모여있는 집합을 의미한다.             |
| 메뉴 그룹 등록 | Register MenuGroup | 키친포스에 메뉴 그룹을 우선 등록해야 메뉴를 등록할 수 있다. |

### 메뉴

| 한글명      | 영문명               | 설명                                           |
|----------|-------------------|----------------------------------------------|
| 메뉴       | Menu              | 한 개 이상의 상품으로 이루어진 상품의 집합을 의미한다.              |
| 주문한 메뉴   | Ordered Menu      | 손님이 주문한 메뉴를 뜻한다.                             |
| 등록된 메뉴   | Registered Menu   | 점장이 키친포스에 등록한 메뉴를 뜻한다.                       |
| 숨겨진 메뉴   | Hidden Menu       | 키친포스에서 숨겨진 메뉴를 뜻한다.                          |
| 메뉴 등록    | Register Menu     | 한 개 이상의 등록된 상품으로 메뉴를 등록할 수 있습니다.             |
| 메뉴 노출    | Display Menu      | 메뉴를 노출할 수 있다. 손님은 노출된 메뉴를 주문할 수 있다.          |
| 메뉴 숨김    | Hide Menu         | 점장은 메뉴를 숨길수 있다. 메뉴를 숨기면 손님은 해당 메뉴를 주문할 수 없다. |
| 메뉴 가격    | Menu Price        | 메뉴의 가격을 나타낸다.                                |
| 메뉴 가격 변경 | Change Menu Price | 점장은 메뉴 가격을 변경할 수 있다.                         |
| 메뉴 이름    | Menu Name         | 메뉴의 이름을 나타낸다.                                |
| 메뉴 목록    | Menus             | 복수개의 메뉴를 의미한다.                               |
| 손님       | Customer          | 음식점에 음식을 주문하는 고객                             |
| 점장       | Owner             | 식당 사장님                                       |
| 비속어      | Profanity         | 욕설 또는 비속어를 말한다.                              |

### 주문 테이블

| 한글명         | 영문명                     | 설명                        |
|-------------|-------------------------|---------------------------|
| 주문 테이블      | Table                   | 매장에 비치된 테이블               |
| 주문 테이블 등록   | Register Table          | 사장님은 주문 테이블을 등록할 수 있다.    |
| 주문 테이블 이름   | Table Name              | 테이블의 이름                   |
| 빈테이블        | Empty Table             | 손님이 앉지 않은 빈 테이블           |
| 빈테이블 해지     | Sit Table               | 손님이 주문 테이블에 앉은 상태를 표현한다.  |
| 빈테이블 설정     | Clear Table             | 주문이 완료된 손님의 테이블을 정리한다.    |
| 방문한 손님 수    | Number Of Guests        | 주문 테이블을 사용하는 손님 수         |
| 방문한 손님 수 변경 | Change Number Of Guests | 주문 테이블을 사용하는 손님의 수를 변경한다. |
| 주문 테이블 목록   | Tables                  | 복수개의 주문 테이블               |
| 손님          | Customer                | 음식점에 음식을 주문하는 고객          |

### 주문

| 한글명       | 영문명               | 설명                                                                                            |
|-----------|-------------------|-----------------------------------------------------------------------------------------------|
| 주문        | Order             | 키친포스에 있는 메뉴를 손님이 구매한 것을 의미한다.                                                                 |
| 주문 유형     | OrderType         | 손님이 주문할 수 있는 주문 방식을 의미한다. 주문 유형에는 배달, 포장, 매장이 있다.                                             |         
| 배달 주문     | Delivery Order    | 손님이 주문을 하면 배달 대행업체를 통해 배달되는 주문                                                                |
| 포장 주문     | TakeOut Order     | 손님이 주문을 하고 음식이 준비되면 직접 찾으러 가는 주문                                                              |
| 매장 주문     | EatIn Order       | 손님이 매장에서 직접하는 주문                                                                              |
| 배달 주소     | DeliveryAddress   | 손님이 음식을 받을 주소를 뜻한다. `배달 주문` 의 경우 필요하다.                                                        |
| 주문 등록     | Create Order      | 손님이 키친포스에 있는 메뉴를 구매하는 행위를 의미한다.                                                               |
| 주문 상태     | OrderStatus       | 주문이 받아들여지고 나서부터 완료될 때까지의 상태를 나타낸다. 주문 상태는 `접수 대기`, `접수`, `서빙`, `배달 시작`, `배달 완료`, `완료` 로 구성된다. |
| 접수 대기     | Waiting           | 주문이 아직 접수되지 않은 상태                                                                             |
| 접수        | Accept            | 주문이 확인되어 수락된 상태                                                                               |
| 서빙        | Serve             | 손님 혹은 라이더에게 음식을 제공한 상태                                                                        |
| 배달 시작     | Start Delivery    | 손님에게 음식을 배달하고 있는 상태                                                                           |
| 배달 완료     | Complete Delivery | 손님에게 정상적으로 음식을 배달 완료한 상태                                                                      |
| 완료        | Complete          | 손님에게 음식 제공이 끝나서 주문이 완료된 상태                                                                    |
| 배달 대행사    | DeliveryAgency    | 배달을 전문으로 하는 외부 대행사. 호출을 받으면 배달 대행사에서 배달을 대행해준다.                                               |
| 배달 대행사 호출 | Call Delivery     | 손님에게 배달을 하기 외부 배달 대행사에게 요청하는 행위                                                               |
| 손님        | Customer          | 음식점에 음식을 주문하는 고객                                                                              |

## 모델링
