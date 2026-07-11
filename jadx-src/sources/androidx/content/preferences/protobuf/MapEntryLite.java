package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.WireFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class MapEntryLite<K, V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Metadata f38081n;
    private final Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f38082t;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f38083n;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f38083n = iArr;
            try {
                iArr[WireFormat.FieldType.f38212T.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38083n[WireFormat.FieldType.Xw.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38083n[WireFormat.FieldType.f38214X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class Metadata<K, V> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final WireFormat.FieldType f38084n;
        public final Object nr;
        public final Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final WireFormat.FieldType f38085t;

        public Metadata(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.f38084n = fieldType;
            this.rl = obj;
            this.f38085t = fieldType2;
            this.nr = obj2;
        }
    }

    static void O(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.g(codedOutputStream, metadata.f38084n, 1, obj);
        FieldSet.g(codedOutputStream, metadata.f38085t, 2, obj2);
    }

    public static MapEntryLite nr(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        return new MapEntryLite(fieldType, obj, fieldType2, obj2);
    }

    static int rl(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.nr(metadata.f38084n, 1, obj) + FieldSet.nr(metadata.f38085t, 2, obj2);
    }

    Metadata t() {
        return this.f38081n;
    }

    private MapEntryLite(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.f38081n = new Metadata(fieldType, obj, fieldType2, obj2);
        this.rl = obj;
        this.f38082t = obj2;
    }

    public int n(int i2, Object obj, Object obj2) {
        return CodedOutputStream.a(i2) + CodedOutputStream.s7N(rl(this.f38081n, obj, obj2));
    }
}
