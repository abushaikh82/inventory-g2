package com.redhat.cloudnative.inventory.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-02T12:07:47.740+03:00[Asia/Riyadh]")

@Controller
@RequestMapping("${openapi.inventory.base-path:/api}")
public class InventoryApiController implements InventoryApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InventoryApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
