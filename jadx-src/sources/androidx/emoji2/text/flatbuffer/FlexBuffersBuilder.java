package androidx.emoji2.text.flatbuffer;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class FlexBuffersBuilder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ReadWriteBuf f38380n;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<Value> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ FlexBuffersBuilder f38381n;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Value value, Value value2) {
            byte b2;
            byte b4;
            int i2 = value.f38382n;
            int i3 = value2.f38382n;
            do {
                b2 = this.f38381n.f38380n.get(i2);
                b4 = this.f38381n.f38380n.get(i3);
                if (b2 == 0) {
                    return b2 - b4;
                }
                i2++;
                i3++;
            } while (b2 == b4);
            return b2 - b4;
        }
    }

    private static class Value {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f38382n;
    }
}
