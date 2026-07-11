package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Parser<MessageType> {
    Object n(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

    Object rl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
}
