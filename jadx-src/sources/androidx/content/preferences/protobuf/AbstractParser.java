package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.MessageLite;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ExtensionRegistryLite f37708n = ExtensionRegistryLite.rl();

    private UninitializedMessageException nr(MessageLite messageLite) {
        return messageLite instanceof AbstractMessageLite ? ((AbstractMessageLite) messageLite).J2() : new UninitializedMessageException(messageLite);
    }

    private MessageLite t(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite == null || messageLite.isInitialized()) {
            return messageLite;
        }
        throw nr(messageLite).n().gh(messageLite);
    }

    public MessageLite J2(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamAYN = byteString.aYN();
        MessageLite messageLite = (MessageLite) rl(codedInputStreamAYN, extensionRegistryLite);
        try {
            codedInputStreamAYN.n(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.gh(messageLite);
        }
    }

    @Override // androidx.content.preferences.protobuf.Parser
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MessageLite n(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return t(J2(byteString, extensionRegistryLite));
    }
}
