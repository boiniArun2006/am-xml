package tj;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f73667n;
    private final Function3 nr;
    private final Function3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function3 f73668t;

    public n(Object obj, Function3 function3, Function3 function32) {
        this.f73667n = obj;
        this.rl = function3;
        this.f73668t = function32;
        this.nr = Wre.f73664n;
    }

    public /* synthetic */ n(Object obj, Function3 function3, Function3 function32, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, (i2 & 4) != 0 ? null : function32);
    }
}
