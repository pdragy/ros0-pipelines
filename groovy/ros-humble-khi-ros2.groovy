node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_ros2.git', branch: 'main'
    registerROS('ros:humble-ros-base', [
        'ros-humble-hardware-interface',
        'ros-humble-moveit-common'
    ], [])
}
