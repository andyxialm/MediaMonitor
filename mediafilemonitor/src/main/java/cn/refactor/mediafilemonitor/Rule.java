package cn.refactor.mediafilemonitor;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by andy (https://github.com/andyxialm)
 * Creation time: 17/8/2 11:54
 * Description: Rule
 */
@IntDef({Rule.LIKE, Rule.EQUAL})
@Retention(RetentionPolicy.SOURCE)
public @interface Rule {
    int LIKE = 0;
    int EQUAL = 1;
}
