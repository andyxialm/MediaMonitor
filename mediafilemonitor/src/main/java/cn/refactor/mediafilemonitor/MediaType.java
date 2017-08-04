/*
  Copyright 2017 andy (https://github.com/andyxialm)

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package cn.refactor.mediafilemonitor;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by andy (https://github.com/andyxialm)
 * Creation time: 17/8/2 11:54
 * Description: MediaType
 */
@IntDef({MediaType.ALL, MediaType.MEDIA_TYPE_IMAGE, MediaType.MEDIA_TYPE_AUDIO, MediaType.MEDIA_TYPE_VIDEO})
@Retention(RetentionPolicy.SOURCE)
public @interface MediaType {
    int ALL = 0;
    int MEDIA_TYPE_IMAGE = 1;
    int MEDIA_TYPE_AUDIO = 2;
    int MEDIA_TYPE_VIDEO = 3;
}
