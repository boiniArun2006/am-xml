package androidx.compose.runtime;

import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u0005J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H&¢\u0006\u0004\b\u0018\u0010\u0005J:\u0010\u001d\u001a\u00020\u00032\u001f\u0010\u001b\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0019¢\u0006\u0002\b\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010\u0005R\u0014\u0010\"\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "", "mUb", "()V", "J2", "node", "KN", "(Ljava/lang/Object;)V", "gh", "", "index", "instance", "O", "(ILjava/lang/Object;)V", "Uo", JavetError.PARAMETER_COUNT, c.f62177j, "(II)V", "from", "to", "t", "(III)V", "clear", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "value", "nr", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "xMQ", "rl", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Applier<N> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    default void J2() {
    }

    void KN(Object node);

    void O(int index, Object instance);

    void Uo(int index, Object instance);

    void clear();

    void gh();

    default void mUb() {
    }

    void n(int index, int count);

    Object rl();

    void t(int from, int to, int count);

    default void nr(Function2 block, Object value) {
        block.invoke(rl(), value);
    }

    default void xMQ() {
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback;
        Object objRl = rl();
        if (objRl instanceof ComposeNodeLifecycleCallback) {
            composeNodeLifecycleCallback = (ComposeNodeLifecycleCallback) objRl;
        } else {
            composeNodeLifecycleCallback = null;
        }
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.qie();
        }
    }
}
