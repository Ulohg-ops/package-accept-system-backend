package com.example.packagereceivesystem.repository;

import com.example.packagereceivesystem.model.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.packagereceivesystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component
public class StudentDao {
    private String GET_ALL_STUDENT_COMMAND="SELECT * FROM student";

    private String GET_STUDENT_BY_ID_COMMAND="SELECT * FROM student WHERE student_id = ?";

    private  String UPDATE_STUDENT = "update student set student_name = ?, student_email  = ? ,student_department =?  where student_id = ?";

    private  String DELETE_STUDENT = "delete from student where student_id = ?";

    private String INSERT_STUDENT_COMMAND="INSERT INTO student(student_id, student_name, student_email, student_department) VALUES (?,?,?,?)";
    private static final Logger log = LoggerFactory.getLogger(StudentDao.class);


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAllStudent(){
        return jdbcTemplate.query(GET_ALL_STUDENT_COMMAND, new StudentMapper());
    }

    public Student findStudentByID(Long id){

        return jdbcTemplate.queryForObject(GET_STUDENT_BY_ID_COMMAND, new Object[] { id }, new StudentMapper());
    }

    public void updateStudent(Student student,Long studentID){
        jdbcTemplate.update(UPDATE_STUDENT,student.getName(),student.getEmail(),student.getDepartment(),studentID);
        log.info("successful updated");
    }

    public void deleteStudent(Long studentID) {
        try {
            jdbcTemplate.update(DELETE_STUDENT, studentID);
            log.info("successful deleted");
        }catch (Exception e){
            log.error(e.toString());
        }
    }

    public String saveStudent(Student student) {
            try{
                jdbcTemplate.update(INSERT_STUDENT_COMMAND, new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps) throws SQLException {
                        ps.setInt(1,Integer.parseInt(student.getId().toString()));
                        ps.setString(2,student.getName());
                        ps.setString(3,student.getEmail());
                        ps.setString(4,student.getDepartment());
                    }
                });
                log.info("successful insert");
                return "successful insert";
//                jdbcTemplate.update("INSERT INTO student(student_id, student_name, student_email, student_department) " +
//                        "VALUES (?,?,?,?)",1005,"456","121","12312");
            } catch (Exception e) {
                log.error(e.toString());
                return e.toString();
            }

    }
}
