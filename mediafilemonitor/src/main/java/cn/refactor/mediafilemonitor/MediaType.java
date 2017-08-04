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
