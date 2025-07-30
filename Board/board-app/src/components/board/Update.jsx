import { Link } from 'react-router-dom'
import styles from './css/Update.module.css'


const Update = () => {
  return (
    <div className="container">
      <h1 className="title">게시글 수정</h1>
      <table className={styles.table} border={1}>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" className={styles['form-input']}/>
          </td>
        </tr>
        <tr>
          <th>작성자</th>
          <td>
            <input type="text" className={styles['form-input']} />
          </td>
        </tr>
        <tr>
          <td colSpan={2}>
            <textarea cols={40} rows={10} 
              className={styles['form-input']}></textarea>
          </td>
        </tr>
      </table>
      <div className="btn-box">
        <div>
          <Link to="/boards" className="btn">목록</Link>
        </div>
        <div>
          <button className="btn">수정</button>
          <button className="btn">삭제</button>
        </div>
      </div>
    </div>
  )
}

export default Update