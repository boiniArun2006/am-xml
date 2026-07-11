package EJn;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface Wre {
    List J2(int i2);

    String KN();

    String O(int i2);

    Wre Uo(int i2);

    Pl getKind();

    default boolean isInline() {
        return false;
    }

    int nr();

    default boolean rl() {
        return false;
    }

    int t(String str);

    boolean xMQ(int i2);

    default List getAnnotations() {
        return CollectionsKt.emptyList();
    }
}
