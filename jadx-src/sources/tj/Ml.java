package tj;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f73661n;
    private final Function3 nr;
    private final Function3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function3 f73662t;

    public Ml(Object obj, Function3 function3, Function3 function32, Function3 function33) {
        this.f73661n = obj;
        this.rl = function3;
        this.f73662t = function32;
        this.nr = function33;
    }

    public /* synthetic */ Ml(Object obj, Function3 function3, Function3 function32, Function3 function33, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function32, (i2 & 8) != 0 ? null : function33);
    }
}
