package com.dianping.zebra.shard.jdbc;

import com.dianping.zebra.shard.exception.ShardParseException;
import com.dianping.zebra.shard.exception.ShardRouterException;
import com.dianping.zebra.shard.merge.MergeContext;
import com.dianping.zebra.shard.parser.DefaultSQLRewrite;
import com.dianping.zebra.shard.parser.SQLParsedResult;
import com.dianping.zebra.shard.parser.SQLParser;
import com.dianping.zebra.shard.parser.SQLRewrite;
import com.dianping.zebra.shard.router.RouterResult;
import com.dianping.zebra.shard.router.ShardRouter;
import com.dianping.zebra.shard.router.rule.RouterRule;
import com.dianping.zebra.shard.router.rule.ShardEvalContext;
import com.dianping.zebra.shard.router.rule.ShardEvalResult;
import com.dianping.zebra.shard.router.rule.TableShardRule;

import java.util.List;

public class MyShardRouter implements ShardRouter {
    private SQLRewrite sqlRewrite = new DefaultSQLRewrite();

    private RouterRule routerRule;

    public MyShardRouter(RouterRule routerRule) {
        this(routerRule, new DefaultSQLRewrite());
    }

    public MyShardRouter(RouterRule routerRule, SQLRewrite sqlRewrite) {
        this.routerRule = routerRule;
        this.sqlRewrite = sqlRewrite;
    }
    @Override
    public RouterResult router(String sql, List<Object> params) throws ShardRouterException, ShardParseException {
//        RouterResult routerResult = new RouterResult();
//        SQLParsedResult parsedResult = SQLParser.parse(sql);
//
//        TableShardRule tableShardRule = findShardRule(parsedResult.getRouterContext(), params);
//        ShardEvalResult shardResult = tableShardRule.eval(new ShardEvalContext(parsedResult, params));
//
//        MergeContext mergeContext = new MergeContext(parsedResult.getMergeContext());
//
//        routerResult.setMergeContext(mergeContext);
//        routerResult.setSqls(buildSqls(shardResult.getDbAndTables(), parsedResult, tableShardRule.getTableName()));
//        routerResult.setParams(buildParams(params, routerResult));
//
//        return routerResult;
        return null;
    }

    @Override
    public boolean validate(String sql) throws ShardParseException, ShardRouterException {
        return true;
    }

    @Override
    public RouterRule getRouterRule() {
        return null;
    }
}
