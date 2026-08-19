{
"timestamp": "2026-08-19T06:21:24.113Z",
"status": 400,
"error": "Bad Request",
"trace": "org.springframework.web.bind.MethodArgumentNotValidException: Validation failed for argument [0] in public org.springframework.http.ResponseEntity<com.res.session6_b1.dto.TransferResponse> com.res.session6_b1.controller.TransferController.transfer(com.res.session6_b1.dto.TransferRequest) with 2 errors: [Field error in object 'transferRequest' on field 'receiverAccountNumber': rejected value []; codes [NotBlank.transferRequest.receiverAccountNumber,NotBlank.receiverAccountNumber,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [transferRequest.receiverAccountNumber,receiverAccountNumber]; arguments []; default message [receiverAccountNumber]]; default message [Receiver account number cannot be blank]] [Field error in object 'transferRequest' on field 'amount': rejected value [5000]; codes [DecimalMin.transferRequest.amount,DecimalMin.amount,DecimalMin.java.math.BigDecimal,DecimalMin]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [transferRequest.amount,amount]; arguments []; default message [amount],true,10000]; default message [Amount must be greater than or equal to 10000]] \r\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor.resolveArgument(RequestResponseBodyMethodProcessor.java:165)\r\n\tat org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:122)\r\n\tat org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:224)\r\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:174)\r\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)\r\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:934)\r\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:853)\r\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:86)\r\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963)\r\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:866)\r\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1000)\r\n\tat org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:903)\r\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:649)\r\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:874)\r\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:710)\r\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:128)\r\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\r\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107)\r\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\r\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\r\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107)\r\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\r\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\r\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107)\r\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:199)\r\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\r\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107)\r\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:165)\r\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:77)\r\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:492)\r\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:113)\r\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:83)\r\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:72)\r\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:341)\r\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:397)\r\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63)\r\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:1272)\r\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1801)\r\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52)\r\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:946)\r\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:480)\r\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:57)\r\n\tat java.base/java.lang.Thread.run(Thread.java:842)\r\n",
"message": "Validation failed for object='transferRequest'. Error count: 2",
"errors": [
{
"objectName": "transferRequest",
"field": "receiverAccountNumber",
"rejectedValue": "",
"codes": [
"NotBlank.transferRequest.receiverAccountNumber",
"NotBlank.receiverAccountNumber",
"NotBlank.java.lang.String",
"NotBlank"
],
"arguments": [
{
"arguments": null,
"code": "receiverAccountNumber",
"codes": [
"transferRequest.receiverAccountNumber",
"receiverAccountNumber"
],
"defaultMessage": "receiverAccountNumber"
}
],
"bindingFailure": false,
"code": "NotBlank",
"defaultMessage": "Receiver account number cannot be blank"
},
{
"objectName": "transferRequest",
"field": "amount",
"rejectedValue": 5000,
"codes": [
"DecimalMin.transferRequest.amount",
"DecimalMin.amount",
"DecimalMin.java.math.BigDecimal",
"DecimalMin"
],
"arguments": [
{
"arguments": null,
"code": "amount",
"codes": [
"transferRequest.amount",
"amount"
],
"defaultMessage": "amount"
},
true,
{
"arguments": null,
"codes": [
"10000"
],
"defaultMessage": "10000"
}
],
"bindingFailure": false,
"code": "DecimalMin",
"defaultMessage": "Amount must be greater than or equal to 10000"
}
],
"path": "/api/v1/transfer"