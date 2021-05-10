# HelloControllerApi

All URIs are relative to *https://localhost:8080/appRoot*

Method | HTTP request | Description
------------- | ------------- | -------------
[**helloUsingGET**](HelloControllerApi.md#helloUsingGET) | **GET** /hello | hello


<a name="helloUsingGET"></a>
# **helloUsingGET**
> String helloUsingGET()

hello

### Example
```java
// Import classes:
//import com.alessio.exampleApiClient.ApiException;
//import com.alessio.exampleApiClient.api.HelloControllerApi;


HelloControllerApi apiInstance = new HelloControllerApi();
try {
    String result = apiInstance.helloUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelloControllerApi#helloUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

