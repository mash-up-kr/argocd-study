# Argocd study

### Docker login
```
docker login argocd-study.kr.ncr.ntruss.com
```

- id/pw: accessKey, secretKey

### Build
```
/gradlew jib -Dtags=0.0.1
```


### Run
```shell
docker run -p 8080:8080 argocd-study.kr.ncr.ntruss.com/argocd-study:0.0.2
```