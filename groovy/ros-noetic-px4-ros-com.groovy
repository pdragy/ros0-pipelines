node {
    git url: 'https://github.com/PX4/px4_ros_com.git', branch: 'ros1'
    registerROS('ros:noetic-ros-base', ['ros-noetic-px4-msgs'], [])
}
