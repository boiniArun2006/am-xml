package co4;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class QJ implements o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f43842n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f43843t;

    private final class j implements stX.j {
        public j() {
        }

        @Override // stX.j
        public String getName() {
            return QJ.this.f43843t;
        }

        @Override // stX.j
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public String t(Object obj, String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            Integer num = (Integer) QJ.this.Uo().n().t(obj, Integer.valueOf(QJ.this.rl.indexOf(newValue) + QJ.this.Uo().J2()));
            if (num == null) {
                return null;
            }
            QJ qj = QJ.this;
            return (String) qj.rl.get(num.intValue() - qj.Uo().J2());
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
        n(Object obj) {
            super(1, obj, QJ.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final String invoke(Object obj) {
            return ((QJ) this.receiver).KN(obj);
        }
    }

    public QJ(afx field, List values, String name) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f43842n = field;
        this.rl = values;
        this.f43843t = name;
        if (values.size() == (field.O() - field.J2()) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + values.size() + ") in " + values + " does not match the range of the field (" + ((field.O() - field.J2()) + 1) + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String KN(Object obj) {
        int iIntValue = ((Number) this.f43842n.n().rl(obj)).intValue();
        String str = (String) CollectionsKt.getOrNull(this.rl, iIntValue - this.f43842n.J2());
        if (str != null) {
            return str;
        }
        return "The value " + iIntValue + " of " + this.f43842n.getName() + " does not have a corresponding string representation";
    }

    public final afx Uo() {
        return this.f43842n;
    }

    @Override // co4.o
    public q6b.I28 n() {
        return new q6b.Dsr(new n(this));
    }

    @Override // co4.o
    public stX.eO rl() {
        return new stX.eO(CollectionsKt.listOf(new stX.l3D(this.rl, new j(), "one of " + this.rl + " for " + this.f43843t)), CollectionsKt.emptyList());
    }

    @Override // co4.o
    public /* bridge */ /* synthetic */ Pl t() {
        return this.f43842n;
    }
}
