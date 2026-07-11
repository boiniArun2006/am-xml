package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final GeneratedMessageInfoFactory f37995n = new GeneratedMessageInfoFactory();

    public static GeneratedMessageInfoFactory n() {
        return f37995n;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfoFactory
    public boolean isSupported(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.content.preferences.protobuf.MessageInfoFactory
    public MessageInfo messageInfoFor(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (MessageInfo) GeneratedMessageLite.S(cls.asSubclass(GeneratedMessageLite.class)).mUb();
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e2);
        }
    }

    private GeneratedMessageInfoFactory() {
    }
}
