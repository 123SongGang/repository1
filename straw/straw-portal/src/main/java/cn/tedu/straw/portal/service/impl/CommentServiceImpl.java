package cn.tedu.straw.portal.service.impl;

import cn.tedu.straw.portal.model.Comment;
import cn.tedu.straw.portal.mapper.CommentMapper;
import cn.tedu.straw.portal.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tedu.cn
 * @since 2021-01-13
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
