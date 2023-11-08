package io.dataease.api.template.request;

import io.dataease.api.template.vo.VisualizationTemplateVO;
import lombok.Data;

/**
 * Author: wangjiahao
 * Date: 2021-03-05
 * Description:
 */
@Data
public class TemplateManageRequest extends VisualizationTemplateVO {
    private String sort;
    private String withBlobs="N";

    private String optType;

    private String staticResource;

    private Boolean withChildren = false;

    public TemplateManageRequest() {
    }

    public TemplateManageRequest(String pid) {
        super.setPid(pid);
        withBlobs="N";
    }
}