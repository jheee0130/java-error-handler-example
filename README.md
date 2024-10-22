이 프로젝트는 Spring Boot와 JPA, H2를 사용하여 게시글을 작성하고 조회합니다. 그리고
@ControllerAdvice와 @ExceptionHandler를 사용하여 예외처리를 하고, 고정된 형태의 응답을 반환하는 프로젝트입니다.

아래는 API 명세서입니다.

# 게시글 작성
## Request
```http
curl --location --request POST 'localhost:8080/post' \
--header 'Content-Type: application/json' \
```
```json
{
    "id":1,
    "title" : "test",
    "content" : "content"
}
```

## Response
```json
{
  "resultCode": 200,
  "resultMsg": "OK"
}
```

## Error Response
```json
{
  "resultCode": 500,
  "resultMsg": "알 수 없는 오류가 발생했습니다."
}
```


# 게시글 조회
## Request
```http
curl --location --request GET 'localhost:8080/post' \
--header 'Content-Type: application/json'
```
```json
{
    "id": 1
}
```

## Response
```json
{
  "resultCode": 200,
  "resultMsg": "OK",
  "id": 1,
  "title": "test",
  "content": "content"
}
```

## Error Response
```json
{
  "resultCode": 404,
  "resultMsg": "게시글을 찾을 수 없습니다."
}
```



# 게시글 리스트 조회
## Request
```http
curl --location 'localhost:8080/post/list'
```

## Response
```json
{
  "resultCode": 200,
  "resultMsg": "OK",
  "posts": [
    {
      "id": 1,
      "title": "test",
      "content": "content"
    },
    {
      "id": 2,
      "title": "",
      "content": "content2"
    }
  ]
}
```
