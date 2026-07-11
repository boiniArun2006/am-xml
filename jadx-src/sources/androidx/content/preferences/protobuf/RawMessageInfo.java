package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
final class RawMessageInfo implements MessageInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MessageLite f38115n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object[] f38116t;

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.f38115n;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        int i2 = this.nr;
        return (i2 & 1) != 0 ? ProtoSyntax.PROTO2 : (i2 & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return (this.nr & 2) == 2;
    }

    Object[] n() {
        return this.f38116t;
    }

    String rl() {
        return this.rl;
    }

    RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f38115n = messageLite;
        this.rl = str;
        this.f38116t = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.nr = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i5 = 1;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 >= 55296) {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i5 = i7;
            } else {
                this.nr = i2 | (cCharAt2 << i3);
                return;
            }
        }
    }
}
