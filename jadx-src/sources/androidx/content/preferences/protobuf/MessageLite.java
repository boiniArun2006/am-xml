package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        Builder Uo(MessageLite messageLite);

        MessageLite build();

        MessageLite buildPartial();

        /* JADX INFO: renamed from: jB */
        Builder xMQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        Builder mergeFrom(byte[] bArr);
    }

    Parser getParserForType();

    int getSerializedSize();

    void n(CodedOutputStream codedOutputStream);

    Builder newBuilderForType();

    Builder toBuilder();

    ByteString toByteString();
}
