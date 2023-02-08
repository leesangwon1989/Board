
유스케이스

![image](https://user-images.githubusercontent.com/121265228/216917286-7540bdef-5153-4895-8aaf-72a8d5650237.png)

API

Method	URL	Request	Response
GET	/board	-	"[
    {
        ""title"": ""title2"",
        ""userName"": ""username2"",
        ""contents"": ""content2"",
        ""createdAt"": ""2023-02-08T18:34:40.312538""
    }
]"
POST	/board	"{
    ""title"":""title"",
    ""username"":""username"",
    ""contents"":""content"",
    ""password"":""password""
}"	"{
    ""title"": ""title"",
    ""userName"": ""username"",
    ""contents"": ""content"",
    ""createdAt"": ""2023-02-08T18:35:44.9221291""
}"
GET	/board/{id}	-	"{
    ""title"": ""title"",
    ""userName"": ""username"",
    ""contents"": ""content"",
    ""createdAt"": ""2023-02-08T18:48:06.917527""
}"
PUT	/board/{id}	"{
    ""title"":""title00"",
    ""username"":""username00"",
    ""contents"":""content00"",
    ""password"":""password""
}"	"{
    ""title"": ""title00"",
    ""userName"": ""username00"",
    ""contents"": ""content00"",
    ""createdAt"": ""2023-02-08T19:13:59.822197""
}"
DELETE	/board/{id}	"{
    ""password"":""password""
}"	-
![image](https://user-images.githubusercontent.com/121265228/217503603-2f48aa56-69d2-4b7b-8f00-0368ba6486f3.png)

