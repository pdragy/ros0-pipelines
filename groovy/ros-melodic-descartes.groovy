node {
    git url: 'https://github.com/ros-industrial-consortium/descartes.git', branch: 'melodic-devel'
    registerROS('ros:melodic-ros-base', ['ros-melodic-eigen-conversions', 'ros-melodic-tf', 'ros-melodic-moveit-ros-planning', 'ros-melodic-moveit-kinematics'], ['ros-melodic-moveit-core'])
}
