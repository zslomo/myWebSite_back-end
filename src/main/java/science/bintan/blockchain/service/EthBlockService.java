package science.bintan.blockchain.service;

import org.web3j.protocol.core.methods.response.EthBlock;

/**
 * Created by lomo on 2017/10/15.
 */
public interface EthBlockService {
    String getBlockByNumber(int number);
    String getBlockByHash(String hash);
    String getCurrentBlock();
    String getblockNumber();
}
