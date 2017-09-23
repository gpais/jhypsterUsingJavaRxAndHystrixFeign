steps:

 1) run the registry
 2) run the uaa server
 3) run the gateway
 4) run the car application
 5) run app 2
 
 In order to call app2 and test the autorized feign calls:
 1)
 curl -XPOST -d "grant_type=password" -d "username=admin" -d "password=admin" "web_app:@localhost:8080/uaa/oauth/token"
 
 2) 
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' --header 
'Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MDYyMzc2NDMsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9BRE1JTiIsIlJPTEVfVVNFUiJdLCJqdGkiOiIzNDI5MjMwYS1kMjVhLTQzNjYtYjQ2ZC1iM2M2Zjc5ZjEzNjIiLCJjbGllbnRfaWQiOiJ3ZWJfYXBwIiwic2NvcGUiOlsib3BlbmlkIl19.GxJUMx7A8sNnW4hcD7A2ktyJHGvbR6yCy15fuoEbyqiyN4MXiyKen1APjgpOIABtCtRlGlqIGQjhoVFQLPMWo1f4OzGdvaAjiNY9ZbXAMw40Cuk68cUR1ewhu_tFxinOwzYaJb_Sn5_eDOwjfyIezFyuhiv-EkcJfG4C7Dy730Mo50haCmLGrcOS9efssbLSq_f35x3dPP-1iq5W7JbYJQOQLX9xijuLHJL2KXuhxf2YMGgaPc86cy5cIpEvU13SM-x_KqXpF8rLOPCSDwIvm2T2KqZ2kE3qpq0hQ-50kpq5fIrKnOFQ4QmtJq5QYbvBqtrWqMo0ggQ-8yMCgfsJXQ' -d '{ \ 
   "brand": "string", \ 
   "doors": "string", \ 
   "plate": "string", \ 
   "year": "string" \ 
 }' 'http://localhost:8081/api/getCars'
 
