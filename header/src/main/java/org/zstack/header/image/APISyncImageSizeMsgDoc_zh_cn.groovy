package org.zstack.header.image

doc {
    title "刷新镜像大小信息(SyncImageSize)"

    category "image"

    desc "获取实时镜像大小信息"

    rest {
        request {
			url "PUT /v1/images/{uuid}/actions"


            header (OAuth: 'the-session-uuid')

            clz APISyncImageSizeMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn "syncImageSize"
					desc "镜像的UUID，唯一标示该镜像"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn "params"
					desc "系统标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn "params"
					desc "用户标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APISyncImageSizeEvent.class
        }
    }
}