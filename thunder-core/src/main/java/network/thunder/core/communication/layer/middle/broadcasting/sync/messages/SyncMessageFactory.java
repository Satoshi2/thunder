package network.thunder.core.communication.layer.middle.broadcasting.sync.messages;

import network.thunder.core.communication.layer.MessageFactory;
import network.thunder.core.communication.layer.middle.broadcasting.types.P2PDataObject;

import java.util.List;

/**
 * Created by matsjerratsch on 30/11/2015.
 */
public interface SyncMessageFactory extends MessageFactory {
    SyncGetMessage getSyncGetMessage (int fragment);

    SyncSendMessage getSyncSendMessage (List<P2PDataObject> dataObjects);

}
