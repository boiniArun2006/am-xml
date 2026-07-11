package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
final class ManifestSchemaFactory implements SchemaFactory {
    private static final MessageInfoFactory rl = new MessageInfoFactory() { // from class: androidx.datastore.preferences.protobuf.ManifestSchemaFactory.1
        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MessageInfoFactory f38078n;

    private static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private MessageInfoFactory[] f38080n;

        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f38080n) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f38080n) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.f38080n = messageInfoFactoryArr;
        }
    }

    public ManifestSchemaFactory() {
        this(rl());
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f38079n;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            f38079n = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.f38078n = (MessageInfoFactory) Internal.rl(messageInfoFactory, "messageInfoFactory");
    }

    private static boolean O(Class cls) {
        return Protobuf.nr || GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    private static boolean n(MessageInfo messageInfo) {
        return AnonymousClass2.f38079n[messageInfo.getSyntax().ordinal()] != 1;
    }

    private static MessageInfoFactory rl() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.n(), t());
    }

    private static MessageInfoFactory t() {
        if (Protobuf.nr) {
            return rl;
        }
        try {
            return (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return rl;
        }
    }

    private static Schema nr(Class cls, MessageInfo messageInfo) {
        ExtensionSchema extensionSchemaRl = null;
        if (O(cls)) {
            NewInstanceSchema newInstanceSchemaRl = NewInstanceSchemas.rl();
            ListFieldSchema listFieldSchemaRl = ListFieldSchemas.rl();
            UnknownFieldSchema unknownFieldSchemaWTp = SchemaUtil.wTp();
            if (n(messageInfo)) {
                extensionSchemaRl = ExtensionSchemas.rl();
            }
            return MessageSchema.v(cls, messageInfo, newInstanceSchemaRl, listFieldSchemaRl, unknownFieldSchemaWTp, extensionSchemaRl, MapFieldSchemas.rl());
        }
        NewInstanceSchema newInstanceSchemaN = NewInstanceSchemas.n();
        ExtensionSchema extensionSchemaN = null;
        ListFieldSchema listFieldSchemaN = ListFieldSchemas.n();
        UnknownFieldSchema unknownFieldSchemaS7N = SchemaUtil.s7N();
        if (n(messageInfo)) {
            extensionSchemaN = ExtensionSchemas.n();
        }
        return MessageSchema.v(cls, messageInfo, newInstanceSchemaN, listFieldSchemaN, unknownFieldSchemaS7N, extensionSchemaN, MapFieldSchemas.n());
    }

    @Override // androidx.content.preferences.protobuf.SchemaFactory
    public Schema createSchema(Class cls) {
        SchemaUtil.T(cls);
        MessageInfo messageInfoMessageInfoFor = this.f38078n.messageInfoFor(cls);
        if (messageInfoMessageInfoFor.isMessageSetWireFormat()) {
            if (O(cls)) {
                return MessageSetSchema.J2(SchemaUtil.wTp(), ExtensionSchemas.rl(), messageInfoMessageInfoFor.getDefaultInstance());
            }
            return MessageSetSchema.J2(SchemaUtil.s7N(), ExtensionSchemas.n(), messageInfoMessageInfoFor.getDefaultInstance());
        }
        return nr(cls, messageInfoMessageInfoFor);
    }
}
