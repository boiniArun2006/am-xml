package xFr;

import WJ.phkN.HFAkacKHsU;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f75359O;
    private int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75360n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75361t;
    private final StringBuilder rl = new StringBuilder();
    private boolean nr = true;
    private int J2 = Integer.MAX_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(int i2, final Function1 function1, z withinObject) {
        Intrinsics.checkNotNullParameter(withinObject, "$this$withinObject");
        withinObject.WPU(i2, new Function1() { // from class: xFr.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.ck(function1, (z) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Function1 function1, z withinObject) {
        Intrinsics.checkNotNullParameter(withinObject, "$this$withinObject");
        function1.invoke(withinObject);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void KN(z zVar, boolean z2, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        zVar.Uo(z2, i2, function1);
    }

    private final void ViF(Function1 function1) {
        if (this.f75359O) {
            this.rl.append(HFAkacKHsU.kukVxngLtZa);
        } else {
            StringBuilder sb = this.rl;
            sb.append("{");
            sb.append('\n');
        }
        this.f75361t++;
        function1.invoke(this);
        this.f75361t--;
        Z();
        int i2 = this.Uo + 1;
        this.Uo = i2;
        if (this.f75359O && i2 < this.J2) {
            this.rl.append("}, ");
            return;
        }
        StringBuilder sb2 = this.rl;
        sb2.append("},");
        sb2.append('\n');
        if (this.f75359O) {
            this.Uo = 0;
            this.rl.append(XQ());
        }
    }

    private final void WPU(int i2, Function1 function1) {
        this.J2 = i2;
        boolean z2 = this.f75359O;
        Z();
        this.Uo = 0;
        this.f75359O = true;
        function1.invoke(this);
        this.f75359O = z2;
        this.Uo = 0;
        this.rl.append('\n');
    }

    private final String XQ() {
        return StringsKt.repeat(this.f75360n, this.f75361t);
    }

    private final void Z() {
        if (this.f75359O) {
            return;
        }
        this.rl.append(XQ());
    }

    private final void aYN(Function1 function1) {
        if (this.f75359O) {
            this.rl.append("[ ");
        } else {
            StringBuilder sb = this.rl;
            sb.append("[");
            sb.append('\n');
        }
        this.f75361t++;
        function1.invoke(this);
        this.f75361t--;
        Z();
        int i2 = this.Uo + 1;
        this.Uo = i2;
        if (this.f75359O && i2 < this.J2) {
            this.rl.append("],");
            return;
        }
        StringBuilder sb2 = this.rl;
        sb2.append("],");
        sb2.append('\n');
        if (this.f75359O) {
            this.Uo = 0;
            this.rl.append(XQ());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Function1 function1, z onSingleLine) {
        Intrinsics.checkNotNullParameter(onSingleLine, "$this$onSingleLine");
        function1.invoke(onSingleLine);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Function1 function1, z withinArray) {
        Intrinsics.checkNotNullParameter(withinArray, "$this$withinArray");
        function1.invoke(withinArray);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Function1 function1, z onSingleLine) {
        Intrinsics.checkNotNullParameter(onSingleLine, "$this$onSingleLine");
        function1.invoke(onSingleLine);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void ty(z zVar, boolean z2, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        zVar.az(z2, i2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(int i2, final Function1 function1, z withinArray) {
        Intrinsics.checkNotNullParameter(withinArray, "$this$withinArray");
        withinArray.WPU(i2, new Function1() { // from class: xFr.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.mUb(function1, (z) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public final String S() {
        return this.f75360n;
    }

    public final void Uo(boolean z2, final int i2, final Function1 arrayBuilder) {
        Intrinsics.checkNotNullParameter(arrayBuilder, "arrayBuilder");
        if (this.nr) {
            Z();
        } else {
            this.nr = true;
        }
        if (z2) {
            aYN(new Function1() { // from class: xFr.qz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.xMQ(i2, arrayBuilder, (z) obj);
                }
            });
        } else {
            aYN(new Function1() { // from class: xFr.Pl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.gh(arrayBuilder, (z) obj);
                }
            });
        }
    }

    public final void az(boolean z2, final int i2, final Function1 objectBuilder) {
        Intrinsics.checkNotNullParameter(objectBuilder, "objectBuilder");
        if (this.nr) {
            Z();
        } else {
            this.nr = true;
        }
        if (z2) {
            ViF(new Function1() { // from class: xFr.Xo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.HI(i2, objectBuilder, (z) obj);
                }
            });
        } else {
            ViF(new Function1() { // from class: xFr.eO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.Ik(objectBuilder, (z) obj);
                }
            });
        }
    }

    public final void o(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.nr) {
            Z();
        } else {
            this.nr = true;
        }
        this.rl.append(value);
        int i2 = this.Uo + 1;
        this.Uo = i2;
        if (this.f75359O && i2 < this.J2) {
            this.rl.append(", ");
            return;
        }
        StringBuilder sb = this.rl;
        sb.append(",");
        sb.append('\n');
        if (this.f75359O) {
            this.Uo = 0;
            this.rl.append(XQ());
        }
    }

    public final void qie(String key, Function1 valueBuilder) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueBuilder, "valueBuilder");
        Z();
        StringBuilder sb = this.rl;
        sb.append("\"");
        sb.append(key);
        sb.append("\": ");
        this.nr = false;
        valueBuilder.invoke(this);
    }

    public final void r(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.nr) {
            Z();
        } else {
            this.nr = true;
        }
        this.rl.append("\"");
        this.rl.append(StringsKt.trimStart((CharSequence) StringsKt.prependIndent(value, XQ())).toString());
        this.rl.append("\"");
        int i2 = this.Uo + 1;
        this.Uo = i2;
        if (this.f75359O && i2 < this.J2) {
            this.rl.append(", ");
            return;
        }
        StringBuilder sb = this.rl;
        sb.append(",");
        sb.append('\n');
        if (this.f75359O) {
            this.Uo = 0;
            this.rl.append(XQ());
        }
    }

    public String toString() {
        return StringsKt.removeSuffix(this.rl, ",\n").toString();
    }

    public z(int i2) {
        this.f75360n = StringsKt.repeat(" ", i2);
    }
}
