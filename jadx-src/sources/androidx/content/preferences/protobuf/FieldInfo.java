package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@CheckReturnValue
final class FieldInfo implements Comparable<FieldInfo> {
    private final Field E2;
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Class f37941O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final boolean f37942S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Internal.EnumVerifier f37943T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Object f37944X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final boolean f37945Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f37946e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final OneofInfo f37947g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Field f37948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f37949o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Field f37950r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FieldType f37951t;

    public static final class Builder {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f37952n;

        static {
            int[] iArr = new int[FieldType.values().length];
            f37952n = iArr;
            try {
                iArr[FieldType.f37980v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37952n[FieldType.f37960E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37952n[FieldType.f37972Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37952n[FieldType.Org.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public int J2() {
        return this.J2;
    }

    public Class KN() {
        int i2 = AnonymousClass1.f37952n[this.f37951t.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Field field = this.f37948n;
            return field != null ? field.getType() : this.f37946e;
        }
        if (i2 == 3 || i2 == 4) {
            return this.f37941O;
        }
        return null;
    }

    public Object Uo() {
        return this.f37944X;
    }

    public boolean az() {
        return this.f37942S;
    }

    public int gh() {
        return this.f37949o;
    }

    public Field mUb() {
        return this.f37950r;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(FieldInfo fieldInfo) {
        return this.J2 - fieldInfo.J2;
    }

    public Field nr() {
        return this.f37948n;
    }

    public FieldType qie() {
        return this.f37951t;
    }

    public Field rl() {
        return this.E2;
    }

    public Internal.EnumVerifier t() {
        return this.f37943T;
    }

    public boolean ty() {
        return this.f37945Z;
    }

    public OneofInfo xMQ() {
        return this.f37947g;
    }
}
