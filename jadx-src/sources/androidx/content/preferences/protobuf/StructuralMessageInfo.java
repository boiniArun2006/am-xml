package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@CheckReturnValue
final class StructuralMessageInfo implements MessageInfo {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MessageLite f38161O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ProtoSyntax f38162n;
    private final FieldInfo[] nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f38163t;

    public static final class Builder {
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.f38161O;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return this.f38162n;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return this.rl;
    }

    public int[] n() {
        return this.f38163t;
    }

    public FieldInfo[] rl() {
        return this.nr;
    }
}
